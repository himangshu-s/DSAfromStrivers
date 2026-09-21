🫧 Bubble SortDefinition & Mechanism: Bubble sort is a simple, comparison-based algorithm that repeatedly steps through a list to swap out-of-order elements. To sort an array, it starts at the beginning and compares adjacent pairs of elements. If the left element is larger than the right element, they swap places. The algorithm repeats this process for the entire list, causing the largest unsorted element to "bubble up" to its correct final position at the end of the array with each complete pass. This cycle continues until a full pass occurs without any swaps, meaning the list is fully sorted


🃏 Insertion SortDefinition & Mechanism: Insertion sort is a comparison sort that builds a final sorted array one element at a time, mimicking how a human sorts a hand of playing cards. Mechanically, it divides the array into two abstract sections: a sorted portion on the left and an unsorted portion on the right. It picks the first element from the unsorted side and compares it backward against the elements in the sorted side. The algorithm shifts all larger sorted elements one position to the right to create an opening, and then inserts the picked element into its correct, vacant slot.



🎯 Selection SortDefinition & Mechanism: Selection sort is an intuitive, in-place sorting algorithm that relies on finding extreme values from the unsorted part of a list. The mechanism operates by maintaining a boundary between a sorted region at the front of the array and an unsorted region at the back. During each pass, the algorithm scans the entire unsorted region to find the absolute smallest element. Once located, it swaps that minimum element with the very first element of the unsorted region, effectively moving the boundary one step to the right until no unsorted items remain


⚡ Quick SortDefinition & Mechanism: Quick sort is a highly efficient, divide-and-conquer sorting algorithm that relies heavily on a process called partitioning. Its working mechanism begins by selecting a target element known as a "pivot" from the array. The algorithm then rearranges the list so that all elements smaller than the pivot are moved to its left, and all larger elements are moved to its right. Once the pivot is locked into its correct final position, the algorithm recursively repeats this exact partitioning process on the remaining left and right sub-arrays.



🧩 Merge SortDefinition & Mechanism: Merge sort is a stable, divide-and-conquer algorithm that guarantees consistent, reliable performance by splitting and combining lists. The mechanism works in two distinct phases: divide and merge. First, it recursively splits the array exactly in half until it is completely broken down into individual sub-arrays containing just one element each. Then, it compares and merges these small arrays back together two at a time, sorting the elements into a temporary space as they combine, repeating until they form a single, fully sorted array.


🔄 Cycle SortDefinition & Mechanism: Cycle sort is an in-place, unstable algorithm designed specifically to be theoretically optimal by minimizing the total number of memory writes. Its working mechanism views the array as a series of mathematical cycles that need to be rotated. The algorithm takes an element, counts exactly how many items in the array are smaller than it to deduce its correct final index, and drops it there. It then takes the element that was just displaced by that move, finds its correct index, and continues this chain reaction until an item lands back in the original starting slot, completing the cycle.

