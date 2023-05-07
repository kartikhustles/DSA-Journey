#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

struct Job
{
    int id;
    int deadline;
    int profit;
};

bool compareJobs(Job a, Job b)
{
    return a.profit > b.profit;
}

int jobSequenceBranchAndBound(vector<Job> &jobs, int profitSoFar, int currDeadline, vector<int> &slots)
{
    int n = jobs.size();
    int maxProfit = profitSoFar;

    if (currDeadline == n)
    {
        return maxProfit;
    }
    Job nextJob = jobs[currDeadline];

    if (currDeadline + 1 <= nextJob.deadline)
    {
        slots[currDeadline] = 1;
        int currProfit = profitSoFar + nextJob.profit;

        int branch1Profit = jobSequenceBranchAndBound(jobs, currProfit, currDeadline + 1, slots);
        maxProfit = max(maxProfit, branch1Profit);

        slots[currDeadline] = 0;
    }

    int branch2Profit = jobSequenceBranchAndBound(jobs, profitSoFar, currDeadline + 1, slots);
    maxProfit = max(maxProfit, branch2Profit);

    return maxProfit;
}

int main()
{
    vector<Job> jobs = {{1, 4, 20}, {2, 1, 10}, {3, 1, 40}, {4, 1, 30}};
    vector<int> slots(jobs.size(), 0);
    int maxProfitBranchAndBound = jobSequenceBranchAndBound(jobs, 0, 0, slots);
    cout << "Maximum profit using branch and bound approach: " << maxProfitBranchAndBound << endl;
    return 0;
}