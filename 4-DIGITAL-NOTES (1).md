# DIGITAL NOTES — Pattern Library
Last updated: [fill in date whenever you re-upload this file]

This file holds one section per PATTERN (not per problem). Each pattern uses the fixed 14-section template below. When you paste a solved problem into a Notes Builder (Mode 3) chat, Claude will check this file for whether the relevant pattern already exists here, then give you either a brand-new note or just the additions to make — you paste that output into the right place below and re-upload.

## Index (update as patterns get added)
<!-- Example once you have entries:
- Sliding Window — Striver Step 10 / NeetCode "Sliding Window" — 🟨 in progress
- Two Pointers — Striver Step 10 / NeetCode "Two Pointers" — ⬜ not started
-->
(empty — no patterns added yet)

---

## TEMPLATE (copy this block for every new pattern)

```
### PATTERN: [Name]

PURPOSE/GOAL:


WHEN TO USE:


WHEN NOT TO USE:


CORE INTUITION:


KEY OBSERVATIONS:


ALGORITHM/APPROACH:


TIME & SPACE COMPLEXITY:


GENERIC TEMPLATE/PSEUDOCODE:


COMMON VARIATIONS:


COMMON MISTAKES/EDGE CASES:


INTERVIEW TIPS:


RELATED PATTERNS:


PRACTICE PROBLEMS:

```

---

## PATTERNS

### PATTERN: Sliding Window — Variable Size

PURPOSE/GOAL:

Find the longest/shortest contiguous subarray or substring that satisfies a condition.

WHEN TO USE:

- Problem asks for a contiguous subarray/substring.
- A window can be expanded and shrunk based on a condition.
- Need to maintain some property such as frequency, sum, distinct elements, etc.

WHEN NOT TO USE:

- Elements do not need to be contiguous.
- The problem requires checking arbitrary combinations/subsets.
- There is no clear way to maintain the required condition while moving the window.

CORE INTUITION:

Use two pointers, `left` and `right`, to represent a window.

- Move `right` to expand the window.
- Update the required information.
- If the window becomes invalid, move `left` to shrink it.
- Once valid, update the answer.

KEY OBSERVATIONS:

- The window represents the current valid/invalid range.
- Each element enters the window once and leaves at most once.
- Therefore, even with a nested `while` loop, the total work is usually O(n).
- For frequency-based problems, a HashMap can track how many times each value appears.

ALGORITHM/APPROACH:

1. Initialize `left = 0`.
2. Move `right` from left to right.
3. Add `nums[right]` to the frequency map.
4. If the window violates the condition, move `left` forward until the window becomes valid.
5. Update the maximum/minimum answer using the current window size.

TIME & SPACE COMPLEXITY:

Time: O(n)

Space: O(n) — HashMap may store up to n distinct elements.

GENERIC TEMPLATE/PSEUDOCODE:

left = 0

for right from 0 to n - 1:
    add nums[right] to window

    while window is invalid:
        remove nums[left] from window
        left++

    update answer using (right - left + 1)

COMMON VARIATIONS:

- Longest valid subarray/substring
- Shortest valid subarray/substring
- At most K occurrences/frequency
- At most K distinct elements
- Sum-based constraints
- Character frequency constraints

COMMON MISTAKES/EDGE CASES:

- Forgetting to update the frequency when moving `left`.
- Updating the answer before making the window valid.
- Confusing `frequency == k` with `frequency > k`.
- Thinking `for + while` automatically means O(n²).
- Empty array / single-element array.
- k = 1 or other small values.

INTERVIEW TIPS:

- Clearly state what makes the window valid.
- Explain what information is being maintained inside the window.
- Explain why `left` and `right` each move only forward, giving O(n) time.
- Prefer the general "expand → check → shrink while invalid → update answer" structure.

RELATED PATTERNS:

- Two Pointers
- Frequency Map / HashMap
- Fixed-Size Sliding Window

PRACTICE PROBLEMS:

- LeetCode 2958 — Length of Longest Subarray With at Most K Frequency

