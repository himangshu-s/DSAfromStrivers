1. What is TreeSet?

TreeSet is a Java collection that stores unique elements in sorted order. It belongs to Java's Collections Framework and implements the Set interface.

For example:

TreeSet<Integer> set = new TreeSet<>();

set.add(20);
set.add(5);
set.add(15);
set.add(10);

The elements are automatically maintained as:

[5, 10, 15, 20]

You don't have to manually sort the elements.

Like HashSet, duplicates are not allowed:

set.add(10);
set.add(10);

The second 10 has no effect.

2. TreeSet vs HashSet

Both are Sets, so both store unique elements.

The major difference is what they are designed for:

HashSet
    ↓
Fast exact lookup

"Does 10 exist?"
        ↓
set.contains(10)

Whereas:

TreeSet
    ↓
Sorted elements + ordered/range lookup

"What is the smallest value >= 10?"
        ↓
set.ceiling(10)

So you can remember:

HashSet → Do I have this exact value?

TreeSet → What values are around this value?

3. Creating a TreeSet

First import it:

import java.util.TreeSet;

Then:

TreeSet<Integer> set = new TreeSet<>();

Here:

TreeSet       → class/type
<Integer>     → TreeSet stores Integer objects
set           → reference variable
new TreeSet<> → creates the TreeSet object

You use Integer, not int, because Java's generic collections store objects/reference




9. Why does TreeSet help in LeetCode 220?

Your problem has:

abs(nums[i] - nums[j]) <= valueDiff

Suppose:

nums[i] = 10
valueDiff = 3

We need:

|10 - nums[j]| <= 3

This can be converted into a range:

7 <= nums[j] <= 13

So we're no longer asking:

"Does 10 exist?"

We're asking:

"Does any previous number exist between 7 and 13?"

That's exactly where TreeSet becomes useful.

Suppose our TreeSet contains:

[2, 5, 8, 15, 20]

We can ask:

set.ceiling(7)

It returns:

8

Now we check whether:

8 <= 13

Yes.

Therefore, 8 lies inside our required range:

7 <= 8 <= 13

So we've found a valid pair.

10. Why HashSet isn't enough here

With HashSet, you can efficiently ask:

set.contains(10)

But you can't naturally ask:

"Give me any value between 7 and 13."

That's the important difference.

For example, suppose:

HashSet = {2, 5, 8, 15, 20}

and current value is 10.

You need to discover:

7 <= x <= 13

HashSet doesn't maintain an order that lets you efficiently search this range.

TreeSet does.

Because it keeps the values ordered:

2 → 5 → 8 → 15 → 20

it can efficiently find the closest value to your boundary.