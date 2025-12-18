1SELECT w1.id
2FROM Weather w1
3JOIN Weather w2
4ON DATEDIFF(w1.recordDate, w2.recordDate) = 1
5WHERE w1.temperature > w2.temperature;
6