<div align="center">

# Terminal Game

**A 9th grader, a school textbook, two lines from outside — and 3,279 lines of Java.**

[Project page](https://dev.talken.in/projects/terminal-game.html) · [Download](https://github.com/Shashwat-Gupta57/Terminal-Game/releases/latest) · [All my projects](https://dev.talken.in/#work)

**3,279** lines, in one main() · **263** do-while loops · **942** print statements · **55** screen clears

</div>

---


## About

In the half-yearly exams of 9th grade I genuinely disliked coding. It seemed pointless. Then one evening I wondered whether I could make a character walk across the BlueJ terminal from what I typed — and a month later I had written this.

It is built from exactly what the 9th-grade Computer Applications syllabus teaches: variables, Scanner input, if-else, for loops, String comparisons and printing. Only two things came from outside the classroom — the code that clears the terminal, and the do-while loop. That was the whole toolkit.

With it I built a game engine by hand. There are no arrays of sprites, no classes, no methods besides main: every frame of every animation is drawn line by line, character by character, out of nested loops that print spaces and slashes into exactly the right column — 942 print statements choreographed so that a little (^_^) falls from the top of the screen, lands with his arms up, and walks wherever you tell him.

A title screen, a settings menu that changes the animation speed and turns the loading screen off, a percentage loading bar, a gamer tag, a pause screen, typed commands and secret hash-codes that switch on an action mode and summon a second player. It is the most anyone could squeeze out of a school textbook — and it is the reason everything I have built since exists.

## The whole toolkit

Counted from the source file itself:

| From the 9th-grade syllabus | From outside the classroom |
|---|---|
| 155 `for` loops | 55 × `System.out.print("\u000C")` — clears the BlueJ terminal |
| 56 `if` statements, 29 `else` branches | 263 × `do { … } while (…);` — every frame is built from it |
| 942 `System.out.print` calls | |
| 24 variables, 24 `.equals()` comparisons, 10 Scanner reads | |
| **1** class, **1** method — `main()` | **That's it.** |

## What it does

- **Spawn animation** — The player falls from the top of the terminal, frame by frame, and lands arms-up.
- **Walk cycle** — Four hand-placed frames, three columns per step, redrawn on a timer.
- **Title screen** — Type play, settings or exit — the whole UI is typed commands.
- **Settings** — Animation speed at 0.5×, 1× or 2×, and a switch for the loading screen.
- **Loading bar** — A percentage loading screen drawn in ASCII.
- **Gamer tag** — Your name, asked for and remembered for the session.
- **Pause screen** — Type pause at any time.
- **Hash-codes** — #action# switches on action mode, #normal# turns it off, #addPlayer# summons a second player.

## Play it

- **In BlueJ (the original):** open `Terminal_game2_basic.java`, compile, right-click the class → `void main(String[] args)`. BlueJ's terminal honours the `\u000C` clear-screen character the game is built around.
- **Windows exe:** These apps need **Java 21 or newer**. If you don't have it, install it once with the [JRE Installer](https://github.com/Shashwat-Gupta57/JRE-Installer/releases/latest) — one click, no admin rights. Every app looks for Java in the place it installs to first, then in `JAVA_HOME`. Then download **`Terminal-Game-1.0.0-windows.zip`** from the [latest release](https://github.com/Shashwat-Gupta57/Terminal-Game/releases/latest) and run `Terminal Game.exe` — best in Windows Terminal. The exe adds a tiny launcher that turns `\u000C` into a standard ANSI clear-screen code; the game's own code is untouched.
- **Any JDK:** `javac Terminal_game2_basic.java && java Terminal_game2_basic`

Or watch its original sprites walk across the top of **[dev.talken.in](https://dev.talken.in/#walker)**.

## Under the hood

| | |
|---|---|
| Written in | BlueJ, November 2023 |
| Structure | One class, one main() method |
| Rendering | Nested do-while and for loops printing spaces and slashes |
| Timing | Thread.sleep between frames |
| Clearing | System.out.print("\u000C") |

## License

[GPL-3.0](LICENSE) © Shashwat Gupta · Flex Studios

Made by [Shashwat Gupta](https://dev.talken.in/) — see more at **[dev.talken.in](https://dev.talken.in/)**.
