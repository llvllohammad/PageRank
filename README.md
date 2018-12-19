# PageRank

A directed graph G having 5881 nodes and 35,592 edges is given for this code (soc-sign-bitcointotc.txt). Each line has edge information with the following format: SOURCE, TARGET (SOURCE is the node ID of a source, and TARGET is the node ID of a target.)

the code computes the PageRank (PR) for all nodes of the given graph G. Initial values of PR for all nodes should set to be 1.
Stopping Rule : PageRank stops after a given number of terations (which is  MAX_ITERATIONS_DEFAULT = 100) or if the PageRank values 
between two iterations do not change more than a predefined value (TOLERANCE_DEFAULT = 0.0001).

the output look like:
Rank: ID / PR
1: x / xx.xx
2: x / xx.xx
...
10: x / xx.xx

Data: The graph data is given in the class eTL (soc-sign-bitcointotc.txt). The original data was collected in 2016 by S. Kumar, F. Spezzano, V.S. Subrahmanian, and C. Faloutsos. More information of the data can be found from http://snap.stanford.edu/data/soc-sign-bitcoin-otc.html.
