The important methods to note
Method	Meaning
put(key, value)=	Add/update a key-value pair
get(key)	=Get the value associated with a key
containsKey(key)=	Check whether a key exists
remove(key)=	Remove a key-value pair
size()=	Number of key-value pairs
getOrDefault(key, default)=	Get value, or default if key doesn't exist
keySet()=	Get all keys


## A **HashMap** is a Java collection used to store data in **key-value pairs**, where each key is associated with a value. It is useful when we need to quickly find information using a key, especially for **frequency counting, lookup, and mapping one value to another**. Import it using `import java.util.HashMap;` and create it with `HashMap<KeyType, ValueType> map = new HashMap<>();`, for example `HashMap<Integer, Integer> map = new HashMap<>();`. The main methods are `put(key, value)` to add or update a key-value pair, `get(key)` to retrieve the value associated with a key, `containsKey(key)` to check whether a key exists, `remove(key)` to delete a key-value pair, `size()` to get the number of key-value pairs, and `getOrDefault(key, defaultValue)` to return the key's value if it exists or the given default value otherwise. A HashMap stores **unique keys**, but multiple keys can have the same value; if `put()` is called with an existing key, its old value is replaced. HashMap does not maintain sorted order, and it provides **O(1) average time** for `put()`, `get()`, `containsKey()`, and `remove()`. For DSA, one of its most important uses is **frequency counting**: `HashMap<Integer, Integer> freq = new HashMap<>();` followed by `freq.put(num, freq.getOrDefault(num, 0) + 1);`, which means each number is stored as a key and its frequency as the value. Unlike a `HashSet`, which mainly stores unique values and answers **"Have I seen this value?"**, a `HashMap` stores a relationship between a key and some information about it and can answer **"What information is associated with this key?"**. HashMap uses objects for its generic types, so primitive types such as `int` are represented using wrapper classes such as `Integer`; Java automatically handles the conversion through autoboxing. Overall, remember: **HashSet → value**, while **HashMap → key + value**, and HashMap is especially useful when you need to store or count information associated with each element.**
