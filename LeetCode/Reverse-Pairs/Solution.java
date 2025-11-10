update(BIT, index, val):
  while(index > 0):
    BIT[index] += val
    index -= (index & (-index))