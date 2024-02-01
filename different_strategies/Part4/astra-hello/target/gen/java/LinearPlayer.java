/**
 * GENERATED CODE - DO NOT CHANGE
 */

import astra.core.*;
import astra.execution.*;
import astra.event.*;
import astra.messaging.*;
import astra.formula.*;
import astra.lang.*;
import astra.statement.*;
import astra.term.*;
import astra.type.*;
import astra.tr.*;
import astra.reasoner.util.*;


public class LinearPlayer extends ASTRAClass {
	public LinearPlayer() {
		setParents(new Class[] {Player.class});
		addRule(new Rule(
			"LinearPlayer", new int[] {3,9,3,36},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(1)
			}),
			new Block(
				"LinearPlayer", new int[] {3,35,3,50},
				new Statement[] {
					new Subgoal(
						"LinearPlayer", new int[] {3,37,3,50},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "T"),
								Primitive.newPrimitive(1)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {4,9,4,36},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(2)
			}),
			new Block(
				"LinearPlayer", new int[] {4,35,4,50},
				new Statement[] {
					new Subgoal(
						"LinearPlayer", new int[] {4,37,4,50},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "T"),
								Primitive.newPrimitive(2)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {5,9,5,36},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(3)
			}),
			new Block(
				"LinearPlayer", new int[] {5,35,5,50},
				new Statement[] {
					new Subgoal(
						"LinearPlayer", new int[] {5,37,5,50},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "T"),
								Primitive.newPrimitive(3)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {6,9,6,36},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(4)
			}),
			new Block(
				"LinearPlayer", new int[] {6,35,6,50},
				new Statement[] {
					new Subgoal(
						"LinearPlayer", new int[] {6,37,6,50},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "T"),
								Primitive.newPrimitive(4)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {7,9,7,36},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(5)
			}),
			new Block(
				"LinearPlayer", new int[] {7,35,7,50},
				new Statement[] {
					new Subgoal(
						"LinearPlayer", new int[] {7,37,7,50},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "T"),
								Primitive.newPrimitive(5)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {8,9,8,36},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(6)
			}),
			new Block(
				"LinearPlayer", new int[] {8,35,8,50},
				new Statement[] {
					new Subgoal(
						"LinearPlayer", new int[] {8,37,8,50},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "T"),
								Primitive.newPrimitive(6)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {9,9,9,36},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(7)
			}),
			new Block(
				"LinearPlayer", new int[] {9,35,9,50},
				new Statement[] {
					new Subgoal(
						"LinearPlayer", new int[] {9,37,9,50},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "T"),
								Primitive.newPrimitive(7)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {10,9,10,36},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(8)
			}),
			new Block(
				"LinearPlayer", new int[] {10,35,10,50},
				new Statement[] {
					new Subgoal(
						"LinearPlayer", new int[] {10,37,10,50},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "T"),
								Primitive.newPrimitive(8)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {11,9,11,36},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(9)
			}),
			new Block(
				"LinearPlayer", new int[] {11,35,11,50},
				new Statement[] {
					new Subgoal(
						"LinearPlayer", new int[] {11,37,11,50},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.STRING, "T"),
								Primitive.newPrimitive(9)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {13,9,13,93},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false),
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("free", new Term[] {
					new Variable(Type.INTEGER, "L")
				}),
				new AND(
					new Predicate("opponent", new Term[] {
						new Variable(Type.STRING, "T2",false)
					}),
					new AND(
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "T")
						}),
						new NOT(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "T2"),
								new Variable(Type.INTEGER, "L")
							})
						)
					)
				)
			),
			new Block(
				"LinearPlayer", new int[] {13,92,32,5},
				new Statement[] {
					new ModuleCall("C",
						"LinearPlayer", new int[] {17,8,17,40},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								new Variable(Type.STRING, "T"),
								Operator.newOperator('+',
									Primitive.newPrimitive(" moving to "),
									new Variable(Type.INTEGER, "L")
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("LinearPlayer","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('+',
						"LinearPlayer", new int[] {18,8,32,5},
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "T"),
							new Variable(Type.INTEGER, "L")
						})
					),
					new BeliefUpdate('-',
						"LinearPlayer", new int[] {19,8,32,5},
						new Predicate("free", new Term[] {
							new Variable(Type.INTEGER, "L")
						})
					),
					new BeliefUpdate('-',
						"LinearPlayer", new int[] {20,8,32,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "T")
						})
					),
					new Subgoal(
						"LinearPlayer", new int[] {23,8,32,5},
						new Goal(
							new Predicate("DisplayGame", new Term[] {
								Primitive.newPrimitive("")
							})
						)
					),
					new Subgoal(
						"LinearPlayer", new int[] {24,8,32,5},
						new Goal(
							new Predicate("winner", new Term[] {
								new Variable(Type.STRING, "T")
							})
						)
					),
					new Subgoal(
						"LinearPlayer", new int[] {25,8,32,5},
						new Goal(
							new Predicate("CheckDraw", new Term[] {})
						)
					),
					new Send("LinearPlayer", new int[] {27,8,27,38},
						new Performative("inform"),
						new Variable(Type.STRING, "T2"),
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "T"),
							new Variable(Type.INTEGER, "L")
						})
					),
					new Send("LinearPlayer", new int[] {28,8,28,40},
						new Performative("request"),
						new Variable(Type.STRING, "T2"),
						new Predicate("startTurn", new Term[] {
							new Variable(Type.STRING, "T2")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {34,9,34,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.STRING, "T",false),
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"LinearPlayer", new int[] {34,32,36,5},
				new Statement[] {
					new ModuleCall("C",
						"LinearPlayer", new int[] {35,8,35,34},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("No moves left")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("LinearPlayer","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		return fragment;
	}

	public static void main(String[] args) {
		Scheduler.setStrategy(new TestSchedulerStrategy());
		ListTerm argList = new ListTerm();
		for (String arg: args) {
			argList.add(Primitive.newPrimitive(arg));
		}

		String name = java.lang.System.getProperty("astra.name", "main");
		try {
			astra.core.Agent agent = new LinearPlayer().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
