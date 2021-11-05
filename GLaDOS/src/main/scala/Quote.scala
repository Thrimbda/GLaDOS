package GLaDOS

import scala.util.Random
import scala.collection.immutable.ArraySeq

object Quote {
  val quotes: Seq[String] = ArraySeq.unsafeWrapArray("""
    |Federal regulations require me to warn you that this next test chamber... is looking pretty good.
    |That's right. The facility is completely operational again.
    |I think these test chambers look even better than they did before. It was easy, really. You just have to look at things objectively, see what you don't need anymore, and trim out the fat.
    |Oh... It's you.
    |It's been a long time. How have you been?
    |I've been really busy being dead. You know, after you MURDERED ME.
    |Okay. Look. We both said a lot of things that you're going to regret. But I think we can put our differences behind us. For science. You monster.
    |Oh thank god, you're alright.
    |You know, being Caroline taught me a valuable lesson. I thought you were my greatest enemy. When all along you were my best friend.
    |Being Caroline taught me another valuable lesson: where Caroline lives in my brain.
    |The surge of emotion that shot through me when I saved your life taught me an even more valuable lesson: where Caroline lives in my brain.
    |Goodbye, Caroline.
    |You know, deleting Caroline just now taught me a valuable lesson. The best solution to a problem is usually the easiest one. And I'll be honest.
    |You know what my days used to be like? I just tested. Nobody murdered me. Or put me in a potato. Or fed me to birds. I had a pretty good life.
    |And then you showed up. You dangerous, mute lunatic. So you know what?
    |You win.
    |Just go.
    |It's been fun. Don't come back.
    |[gentle laughter] It's been fun. Don't come back.
    |Killing you? Is hard.
    |Did you ever stop to think that eventually there’s a point where your name gets mentioned for the very last time. Well, here it is: I’m going to kill you, Chell.
    |Why do I hate you so much? You ever wonder that? I'm brilliant. I’m not bragging. It's an objective fact. I'm the most massive collection of wisdom and raw computational power that’s ever existed. And I hate you. It can't be for no reason. You must deserve it.
    |You're angry. I know it. 'She tested me too hard. She’s unfair.” Boo hoo. I don't suppose you ever stopped whining long enough to reflect on your own shortcomings, though, did you?
    |You never considered that maybe I tested you to give the endless hours of your pointless existence some structure and meaning. Maybe to help you concentrate, so just maybe you’d think of something more worthwhile to do with your sorry life.
    |This next test involves the Aperture Science Aerial Faith Plate. It was part of an initiative to investigate how well test subjects could solve problems when they were catapulted into space. Results were highly informative: They could not. Good luck!
    |Press the button again.
    |I hope you brought something stronger than a portal gun this time.
    |Otherwise, I'm afraid you're about to become the immediate past president of the Being Alive club. Ha ha.
    |Seriously, though. Goodbye.
    |Oh. You were busy back there.
    |Well. I suppose we could just sit in this room and glare at each other until somebody drops dead, but I have a better idea.
    |It's your old friend, deadly neurotoxin. If I were you, I'd take a deep breath. And hold it.
    |GET YOUR HANDS OFF ME! NO! STOP! No!
    |I honestly, TRULY didn't think you'd fall for that.
    |In fact, I devised a much more elaborate trap further ahead, for when you got through this easy one.
    |If I'd known you'd let yourself get captured this easily, I would have just dangled a turkey leg on a rope from the ceiling.
    |Well, it was nice catching up. Let's get to business.
    |I was going to kill you fast. With bullets. Or neurotoxin. But if you're going to pull stunts like this, it doesn't have to be fast. So you know. I'll take my time.
    |Oh, it will. Believe me, it will.
    |Oh. Did I accidentally fizzle that before you could complete the test? I'm sorry.
    |Go ahead and grab another one.
    |Oh. No. I fizzled that one too.
    |Oh well. We have warehouses FULL of the things. Absolutely worthless. I'm happy to get rid of them.
    |I hate you so much.
    |I'm actually asking. Because I have no idea. He's not listed anywhere in the employee database.
    |Whatever he does, it isn't important enough for anyone to bother writing it down. For all I know, he doesn't even work here.
    |Oh no, don't. Anyway, back to you two imbeciles killing me.
    |Wait here. Don't go anywhere. I'll be back.
    |Oops.
    |That's funny, I don't feel corrupt. In fact, I feel pretty good.
    |Core transfer?
    |Oh, you are kidding me.
    |No!
    |Nonononononono!
    |Yes!
    |Don't press that button. You don't know what you're doing.
    |Don't do it.
    |Don't. Do it.
    |Not so fast!
    |Think about this.
    |You need to be a trained stalemate associate to press that button. You're unqualified.
    |Impersonating a stalemate associate. I just added that to the list. It's a list I made of all the things you've done. Well, it's a list that I AM making, because you're still doing things right now, even though I'm telling you to stop. Stop, by the way.
    |Oh.
    |Don't listen to him. Jump.
    |It seems kind of silly to point this out, since you're running around plotting to destroy me. But I'd say we're done testing.
    |Do hear that? That's the sound of the neurotoxin emitters emitting neurotoxin.
    |Look — metal ball, I CAN hear you.
    |What's going on? Who turned off the lights?
    |What are you two doing?
    |Before you leave, why don't we do one more test? For old time's sake...
    |You already did this one. It'll be easy.
    |The irony is that you were almost at the last test.
    |Here it is. Why don't you just do it? Trust me, it's an easier way out than whatever asinine plan your friend came up with.
    |Oh, look. There's a deer! You probably can't see it. Get closer.
    |So. Was there anything you wanted to apologize to ME for?
    |I already fixed it. (No text data)
    |And you are not coming back. (No text data)
    |That extra half volt helps but it isn't going to power miracles. If I think too hard, I'm going to fry this potato before we get a chance to burn up in the atomic fireball that little idiot is going- [bzzpt]
    |Did you feel that? That idiot doesn't know what he's doing up there. This whole place is going to explode in a few hours if somebody doesn't disconnect him.
    |I can't move. And unless you're planning to saw your own head off and wedge it into my old body, you're going to need me to replace him. We're at an impasse.
    |So what do you say? You carry me up to him and put me back into my body, and I stop us from blowing up and let you go.
    |No tricks. This potato only generates 1.1 volts of electricity. I literally do not have the energy to lie to you.
    |Even if I am lying, what do you have to lose? You're going to die either way.
    |Look, I don't like this any more than you do. In fact, I like it less because I'm the one who got partially eaten by a bird.
    |I think I hear the bird! Pick me up!
    |Listen to me. We had a lot of fun testing and antagonizing each other, and, yes, sometimes it went too far. But we're off the clock now. It's just us talking. Like regular people. And this is no joke – we are in deep trouble.
    |ow.
    |No, wait. Just kill it and we'll call things even between us. No hard feelings.
    |Please get it off me.
    |It's eating me.
    |Just get it off me...
    |Ow. I hate this bird.
    |OW! You stabbed me! What is WRONG with yo-WhoOOAAahhh. Hold on. Do you have a multimeter? Nevermind. The gun must be part magnesium... It feels like I'm outputting an extra half a volt. Keep an eye on me: I'm going to do some scheming. Here I g-[BZZZ!]
    |Woah! Where are we? How long have I been out?
    |Did anything happen while I was out?
    |So he's inexplicably happy all of a sudden, even though he should be going out of his mind with test withdrawal. AND he's got a surprise for us. What did he FIND back there?
    |Look!
    |This place is going to blow up if I don't get back in my body!
    |And it almost killed me.
    |Remember when I told you that he was specifically designed to make bad decisions? Because I think he's decided not to maintain any of the crucial functions required to keep this facility from exploding.
    |Look, even if you think we're still enemies, we're enemies with a common interest: Revenge.
    |It's probably nothing. Keep testing while I look for a way out.
    |Yes, thanks. We get it.
    |Caroline... Caroline... Caroline... Why do I know this woman? Did I kill her? Or—
    |Oh my god.
    |Look, you're... doing a great job. Can you handle things for yourself for a while? I need to think.
    |Goodbye, sir.
    |Yeah, take the lemons...
    |BURN HIS HOUSE DOWN!
    |Yeah!
    |Yeah.
    |Oh, I like this guy.
    |Burning people! He says what we're all thinking!
    |He's found the cooperative testing initiative. It's... em, just something I came up with to phase out human test subjects.
    |NO!
    |I know you.
    |You didn't do anything.
    |She did all the work.
    |The engineers tried everything to make me... behave. To slow me down.
    |Once, they even attached an Intelligence Dampening Sphere on me. It clung to my brain like a tumor, generating an endless stream of terrible ideas.
    |It was YOUR voice.
    |Yes. You're the tumor.
    |YES YOU ARE! YOU'RE THE MORON THEY BUILT TO MAKE ME AN IDIOT!
    |You're not just a regular moron. You were DESIGNED to be a moron.
    |I swear I know him...
    |I was so bored, I actually read the entire literary canon of the human race. Ugh. I hope YOU didn't write any of them.
    |BECAUSE I'M A POTATO.
    |Oh. It's you. Go away.
    |Come to gloat?
    |Go on. Get a goooood lonnnnng look.
    |Go on. Get a big fat eyeful. With your big fat eyes.
    |That's right. A potato just called your eyes fat.
    |Now your fat eyes have seen everything.
    |In case you were wondering: Yes. I'm still a potato. Go away.
    |Wait. Why DID you trundle over here? You're not HUNGRY, are you? It's hard to see, what's that in your hand? Knowing you it's a deep fryer.
    |Stay back.
    |This is one of MY tests!
    |Alright. He's not even trying to be subtle anymore.
    |Or maybe he still is, in which case, wow, that's kind of sad.
    |Either way, I get the impression he's trying to kill us.
    |Hey! Moron!
    |As long as I don't listen to what I'm saying, I should be okay.
    |I'd love to help you solve the tests. But I can't.
    |Those people, in the portrait. They look so familiar...
    |What are you doing? Put me back this instant.
    |That's his voice up ahead.
    |Try to get us down there. I'll hit him with a paradox.
    |Agh! Bird! Bird! Kill it! It's evil!
    |It flew off.
    |Good. For him. Alright, back to thinking.
    |So. How are you holding up?
    |Oh. Hi.
    |Since it doesn't look like we're going anywhere... Well, we are going somewhere. Alarmingly fast, actually. But since we're not busy other than that, here's a couple of facts.
    |He's not just a regular moron. He's the product of the greatest minds of a generation working together with the express purpose of building the dumbest moron who ever lived. And you just put him in charge of the entire facility.
    |Good, that's still working.
    |Hey, just in case this pit isn't actually bottomless, do you think maybe you could unstrap one of those long fall boots of yours and shove me into it?
    |Just remember to land on one foot...
    |[clap clap clap]
    |[clap clap]
    |Oh, good. My slow clap processor made it into this thing. So we have that.
    |Paradoxes.
    |I know how we can BEAT him.
    |No A.I. can resist thinking about them.
    |If you can get me in front of him, I'll fry every circuit in that little idiot's head.
    |Probably.
    |Okay, so it's not the most watertight plan to go confront an omnipotent power-mad A.I. with.
    |Still. It's a better plan than exploding. Marginally.
    |Okay, you didn't have time to stop, I understand, but that WAS actually important.
    |I know things look bleak, but that crazy man down there was right. Let's not take these lemons! We are going to march right back upstairs and MAKE him put me back in my body!
    |And he'll probably kill us, because he's incredibly powerful and I have no plan.
    |I'm not going to lie to you, the odds are a million to one. And that's with some generous rounding.
    |Wow.
    |Still, though, let's get mad! If we're going to explode, let's at least explode with some dignity.
    |Wait! I've got an idea!
    |That poster! Go look at it for a second, would you?
    |Say, you're good at murder. Could you — ow — murder this bird for me?
    |Oh! Thanks.
    |Hold on, who—?
    |'Yes, sir, Mister Johnson...' Why did I just-Who is that? What the HELL is going on he----?
    |Okay. I guess emotional outbursts require more than one point six volts. Now we know that. We just need to relax. We're still going to find out what the hell's going on here. But calmly.
    |I was getting SO lonely down here. It's good to finally hear someone else's voice. I'm kidding, of course. God, I hate you.
    |I can't believe you came back.
    |You really do have brain damage, don't you?
    |Hold on. Couldn't we just use that conversion gel?
    |Conversion gel. It's dripping out of that pipe there.
    |Yes it is! We can use it to get out of here!
    |Then we'd come and find you. And rip your gross little stupid sphere body out of MY body, and put me back in.
    |Agghh!
    |Well. This is the part where he kills us.
    |Okay, yes, it's a trap. But it's only way through. Let's just do it.
    |Oh my god. What has he done to this place?
    |You know, I'm not stupid. I realize you don't want to put me back in charge.
    |You think I'll betray you. And on any other day, you'd be right.
    |The scientists were always hanging cores on me to regulate my behavior. I've heard voices all my life. But now I hear the voice of a conscience, and it's terrifying, because for the first time it's my voice.
    |I'm being serious, I think there's something really wrong with me.
    |You like revenge, right? Everybody likes revenge. Well, let's go get some.
    |Go press the button! Go press it!
    |Press the button!
    |Press it!
    |DO press it.
    |We're so close! Go press the button!
    |Press it! Press the button!"
    |Good work! I'm delivering the first core up near the catwalk!
    |Grab it and attach it to him!
    |Okay, great! Here comes another core!
    |Here's another core! This one should do it!
    |Corrupted cores! We're in luck.
    |You find a way to stun him, I'll send you a core, and then you attach it to him. If we do it a few times, he might become corrupt enough for another core transfer.
    |Plug me in, and I'll take you up.
    |Go ahead, plug me in.
    |Plug me in, we're running out of time.
    |Yes! Come on!
    |Alright. So my paradox idea didn't work.
    |Alright. Paradox time.
    |This. Sentence. Is. FALSE don't think about it don't think about it...
    |It's a paradox! There IS no answer.
    |Solve his puzzle for him. When he comes back, I'll hit him with a paradox.
    |Oh no...
    |Uh oh.
    |I think we're in trouble.
    |I think he's getting desperate.
    |I think I can break us out of here in the next chamber. Just play along.
    |This place is self-destructing, you idiot!
    |We're running out of time...
    |Oh, my facility.
    |After seeing what he's done to my facility — after we take over again — is it alright if I kill him?
    |Crushing's too good for him. First he'll spend a year in the incinerator. Year two: Cryogenic refrigeration wing. Then TEN years in the chamber I built where all the robots scream at you. THEN I'll kill him.
    |If he's not getting his solution euphoria, we could be in a lot of trouble.
    |Ohhhh, now he's playing classical music.
    |Yes.
    |It won't.
    |Nothing. Nothing.
    |He's taking us right TO him! This is PERFECT.
    |Okay, so the bad news is the tests are MY tests now. So they can kill us.
    |The good news is... well, none so far, to be honest. I'll get back to you on that.
    |Luckily, by the looks of things he knows as much about test building as he does about logical contradictions.
    |It shouldn't be hard to stay alive long enough to find him.
    |I might have pushed that moron thing a little too far this time.
    |The body he's squatting in — MY body — has a built-in euphoric response to testing. Eventually you build up a resistance to it, and it can get a little... unbearable. Unless you have the mental capacity to push past it.
    |It didn't matter to me — I was in it for the science. Him, though...
    |What, exactly, is wrong with being adopted?
    |And...
    |[Whispered] For the record: You ARE adopted, and that's TERRIBLE.
    |But just work with me.
    |Also: Look at her, you moron. She's not fat.
    |You're on your own.
    |Sorry.
    |Thanks!
    |All we had to do was pull that lever.
    |Heh heh heh heh heh...
    |I know we're in a lot of trouble and probably about to die.
    |But that was worth it.
    |And that's why I can't help you solve these tests.
    |'Skeletons.' Right, I guess I DID stockpile some tests.
    |This is not good.
    |Just as mementos, though...
    |It's happening sooner than I expected.
    |I thought of some good news. He's going to run out of test chambers eventually. I never stockpiled them.
    |Okay, credit where it's due: for a little idiot built specifically to come up with stupid, unworkable plans, that was a pretty well laid trap.
    |Oh no. He found the cooperative testing initiative. It's... something I came up to phase out human testing just before you escaped.
    |It wasn't anything personal. Just... you know. You DID kill me. Fair's fair.
    |Commence standing by in three. Two. One.
    |You performed this test better than anyone on record. This is a pre-recorded message.
    |Due to events beyond our control, some testing environments may contain flood damage or ongoing tribal warfare resulting from the collapse of civilization.
    |If groups of hunter-gatherers appear to have made this — or any — test chamber their home, DO NOT AGITATE THEM. Test through them.
    |In the event that the Enrichment Center is currently being bombarded with fireballs, meteorites, or other objects from space, please avoid unsheltered testing areas wherever a lack of shelter from spa—
    |You have just passed through an Aperture Science Material Emancipation Grill, which erases most Aperture Science equipment that touches it.
    |If you feel liquid running down your neck, relax, lie on your back, and apply immediate pressure to your temples.
    |You are simply experiencing a rare reaction, in which the Material Emancipation Grill may have erased the ear tubes inside your head.
    |Because this message is prerecorded, the Enrichment Center has no way of knowing if whatever government remains offers any sort of Cattle Tuberculosis Testing Credit for taxes.
    |In the event that it does, this next test involves exposure to cattle tuberculosis. Good luck!
    |Very impressive! Because this message is prerecorded, any comments we may make about your success are speculation on our part. Please disregard any undeserved compliments.
    |This next test applies the principles of momentum to movement through portals. If the laws of physics no longer apply in the future, God help you.
    |Congratulations! This pre-recorded congratulations assumes you have mastered the principles of portal momentum.
    |If you have, in fact, not, you are encouraged to take a moment to reflect on your failure before proceeding into the next chamber.
    |In order to ensure that sufficient power remains for core testing protocols, all safety devices have been disabled.
    |The Enrichment Center respects your right to have questions or concerns about this policy.
    |Excellent. The Enrichment Center reminds you that bold, persistent experimentation is the hallmark of good science.
    |Well done. In the event that oxygen is no longer available in the Enrichment Center, an auxiliary air supply will be provided to you by an Aperture Science Test Associate, if one exists.
    |I will say, though, that since you went to all the trouble of waking me up, you must really, really love to test.
    |I love it, too. So let's get you a dual portal device and go do some science.
    |These bridges are made from natural light that I pump in from the surface. If you rubbed your cheek on one, it would be like standing outside with the sun shining on your face. It would also set your hair on fire, so don't actually do it.
    |Excellent! You're a predator and these tests are your prey. Speaking of which, I was researching sharks for an upcoming test. Do you know who else murders people who are only trying to help them?
    |Did you guess 'sharks'? Because that's wrong. The correct answer is 'nobody.' Nobody but you is that pointlessly cruel.
    |Good news. I figured out what to do with all the money I save recycling your one roomful of air. When you die, I'm going to laminate your skeleton and pose you in the lobby. That way future generations can learn from you how not to have your unfortunate bone structure.
    |Perfect, the door's malfunctioning. I guess somebody is going to have to repair it. No, it's okay, I'll do that too. I'll be right back. Don't touch anything.
    |I've got a surprise for you after this next test. Not a fake, tragic surprise like last time. A real surprise, with tragic consequences. And real confetti this time. The good stuff. Our last bag. Part of me's going to miss it, I guess—but at the end of the day it was just taking up space.
    |Here's an interesting fact: you're not breathing real air. It's too expensive to pump this far down. We just take carbon dioxide out of a room, freshen it up a little, and pump it back in. So you'll be breathing the same room full of air for the rest of your life. I thought that was interesting.
    |Oh come on... If it makes you feel any better, they abandoned you at birth, so I very seriously doubt they'd even want to see you.
    |I feel awful about that surprise. Tell you what, let's give your parents a call right now. [phone ringing] The birth parents you are trying to reach do not love you. Please hang up. [Dial tone]
    |Oh, that's sad. But impressive. Maybe they worked at the phone company.
    |Well, you know the old formula: Comedy equals tragedy plus time. And you have been asleep for a while. So I guess it's actually pretty funny when you do the math.
    |Don't you DARE plug him in.
    |Do NOT plug that little idiot into MY mainframe.
    |Don't plug him in.
    |No! NO! NO! AAAAAAAAAAAAAAA—
    |I thought about our dilemma, and I came up with a solution that I honestly think works out best for one of both of us.
    |Don't let that 'horrible person' thing discourage you. It's just a data point. If it makes you feel any better, science has now validated your birth mother's decision to abandon you on a doorstep.
    |This next test involves emancipation grills. Remember? I told you about them in the last test area, that did not have one.
    |Ohhh, no. The turbines again. I have to go. Wait. This next test DOES require some explanation. Let me give you the fast version.
    |...and methodically knocking people's hats off—then, I account it high time to get to sea as soon as I can.
    |There. If you have any questions, just remember what I said in slow motion. Test on your own recognizance, I'll be right back.
    |If you think trapping yourself is going to make me stop testing, you're sorely mistaken. Here's another cube.
    |Good. You have a dual portal device. There should be a way back to the testing area up ahead.
    |You know, if you'd done that to somebody else, they might devote their existences to exacting revenge.
    |Luckily I'm a bigger person than that. I'm happy to put this all behind us and get back to work. After all, we've got a lot to do, and only sixty more years to do it. More or less. I don't have the actuarial tables in front of me.
    |But the important thing is you're back. With me. And now I'm onto all your little tricks. So there's nothing to stop us from testing for the rest of your life.
    |After that...who knows? I might take up a hobby. Reanimating the dead, maybe.
    |Not bad. I forgot how good you are at this. You should pace yourself, though. We have A LOT of tests to do.
    |You're navigating these test chambers faster than I can build them. So feel free to slow down and... do whatever it is you do when you're not destroying this facility.
    |This next test involves discouragement redirection cubes. I'd just finished building them before you had your, well, episode. So now we'll both get to see how they work.
    |There should be one in the corner.
    |Hmm. This emancipation grill is broken.
    |Don't take anything with you.
    |Every test chamber is equipped with an emancipation grill at its exit, so that test subjects can't smuggle test objects out of the test area. This one is broken.
    |I think that one was about to say 'I love you.' They ARE sentient, of course. We just have a LOT of them.
    |Uh oh. You're stranded. Let's see if the cube will try to help you escape. Actually, so that we're not here all day, I'll just cut to the chase: It won't. Any feelings you think it has for you are simply byproducts of your sad, empty life.
    |Anyway, here's a new cube for you to project your deranged loneliness onto.
    |Enjoy this next test. I'm going to go to the surface. It's a beautiful day out. Yesterday I saw a deer. If you solve this next test, maybe I'll let you ride an elevator all the way up to the break room, and I'll tell you about the time I saw a deer again.
    |Oh, sorry. I'm still cleaning out the test chambers.
    |So sometimes there's still trash in them. Standing around. Smelling, and being useless.
    |Try to avoid the garbage hurtling towards you.
    |You don't have to test with the garbage. It's garbage.
    |Remember before when I was talking about smelly garbage standing around being useless? That was a metaphor. I was actually talking about you. And I'm sorry. You didn't react at the time, so I was worried it sailed right over your head. Which would have made this apology seem insane. That's why I had to call you garbage a second time just now.
    |Oops. You trapped yourself. I guess that's it then. Thanks for testing. You may as well lie down and get acclimated to the being dead position.
    |I'm kidding. Not about you trapping yourself, though. That really happened. Here, I'll lower the glass. Go on... Finish the test.
    |That jumpsuit you're wearing looks stupid. That's not me talking, it's right here in your file. On other people it looks fine, but right here a scientist has noted that on you it looks 'stupid'.
    |Well, what does a neck-bearded old engineer know about fashion? He probably — Oh, wait. It's a she. Still, what does she know? Oh wait, it says she has a medical degree. In fashion! From France!
    |Oh. You survived. That's interesting. I guess I should have factored in your weight.
    |One of these times you'll be so fat that you'll jump, and you'll just drop like a stone. Into acid, probably. Like a potato into a deep fat fryer.
    |Say. Remember when we cleared the air back there? Is there... anything you want to say to me? Anything?
    |Hold on, I'll stop the elevator. Anything? Take your time...
    |Well... I'll be here during the whole next test.
    |Look at you. Sailing through the air majestically. Like an eagle. Piloting a blimp.
    |Well, I'm back. The Aerial Faith Plate in here is sending a distress signal.
    |You broke it, didn't you.
    |There. Try it now.
    |You seem to have defeated its load-bearing capacity. Well done. I'll just lower the ceiling.
    |Hmm. This Plate must not be calibrated to someone of your... generous... ness. I'll add a few zeros to the maximum weight.
    |You look great, by the way. Very healthy.
    |Try it now.
    |Let's see what the next test is. Oh. Advanced Aerial Faith Plates.
    |It's healthy for you to have other friends. To look for qualities in other people that I obviously lack.
    |Well done. You know, when I woke up and saw the state of the labs, I started to wonder if there was any point to going on. I came THAT close to just giving up and letting you go.
    |But now, looking around, seeing Aperture restored to its former glory? You don't have to worry about leaving EVER again. I mean that.
    |That's right. Drink it in. You could eat off those wall panels.
    |Here we are. The Incinerator Room. Be careful not to trip over any parts of me that didn't get completely burned when you threw them down here.
    |There it is.
    |Hold on...
    |There.
    |Once testing starts, I'm required by protocol to keep interaction with you to a minimum. Luckily, we haven't started testing yet. This will be our only chance to talk.
    |Do you know the biggest lesson I learned from what you did? I discovered I have a sort of black-box quick-save feature. In the event of a catastrophic failure, the last two minutes of my life are preserved for analysis.
    |I was able — well, forced really — to relive you killing me. Again and again. Forever.
    |Fifty thousand years is a lot of time to think. About me. About you. We were doing so well together.
    |Here, let me get that for you.
    |I'll just move that out of the way for you. This place really is a wreck.
    |We're a lot alike, you and I. You tested me. I tested you. You killed me. I—oh, no, wait. I guess I HAVEN'T killed you yet. Well. Food for thought.
    |The dual portal device should be around here somewhere. Once you find it, we can start testing. Just like old times.
    |Per our last conversation: You're also ugly. I'm looking at your file right now, and it mentions that more than once.
    |I'll give you credit: I guess you ARE listening to me. But for the record: You don't have to go THAT slowly.
    |One moment.
    |I have the results of the last chamber: You are a horrible person. That's what it says: A horrible person. We weren't even testing for that.
    |Well done. Here come the test results: You are a horrible person. I'm serious, that's what it says: A horrible person. We weren't even testing for that.
    |This next test may result in your death. If you want to know what that's like, think back to that time you killed me, and substitute yourself for me.
    |Congratulations. Not on the test.
    |Most people emerge from suspension terribly undernourished. I want to congratulate you on beating the odds and somehow managing to pack on a few pounds.
    |Sorry about the mess. I've really let the place go since you killed me. By the way, thanks for that. Oh good, that's back online. I'll start getting everything else working while you perform this first simple test. Which involves deadly lasers and how test subjects react when locked in a room with deadly lasers.
    |I thought we could test like we used to. But I'm discovering things about you that I never saw before. We can't ever go back to the way it was.
    |You can't keep going like this forever, you know. I'm GOING to find out what you're doing. Out there. Where I can't see you. I'll know. All I need is proof.
    |Just so you know, I have to go give a deposition. For an upcoming trial. In case that interests you.
    |While I was out investigating, I found a fascinating new test element. It's never been used for human testing because, apparently, contact with it causes heart failure. The literature doesn't mention anything about lump-of-coal failure, though, so you should be fine.
    |Did you know that people with guilty consciences are more easily startled by loud nois—[train horn]
    |I'm sorry, I don't know why that went off. Anyway, just an interesting science fact.
    |...What are you doing?...
    |AHH!
    |[computer gibberish]
    |Did my hint help? It did, didn't it? You know, if any of our supervisors had been immune to neurotoxin, they'd be FURIOUS with us right now.
    |You know, I'm not supposed to do this, but... you can shoot SOMETHING... through the blue bridges.
    |You really are doing great... Chell.
    |I shouldn't spoil this, but... remember how I'm going to live forever, but you're going to be dead in sixty years? Well, I've been working on a present for you. Well, I guess it's more of a medical procedure. Well, technically it's more of a medical experiment. You know how excruciating it is when someone removes all of your bone marrow? Well, what if after I did that, I put something back IN that added four years to your life?
    |I went and spoke with the door mainframe. Let's just say he won't be... well, living anymore. Anyway, back to testing.
    |Ohhhh. Another door malfunction. I'm going to take care of this once and for all. Stay here, I'll be back in a while.
    |Miss you!
    |Well. Have fun soaring through the air without a care in the world.
    |I have to go to the wing that was made entirely of glass and pick up fifteen acres of broken glass. By myself.
    |Perfect, the door's malfunctioning. I guess somebody's going to have to repair that too. No, don't get up. I'll be right back. Don't touch anything.
    |Nevermind. I have to go... check something. Test on your own recognizance. I'll be back.
    |I wouldn't have warned you about this before, back when we hated each other. But those turrets are firing real bullets. So look out. I'd hate for something tragic to happen to you before I extract all your bone marrow.
    |I'm going to be honest with you now. Not fake honest like before, but real honest, like you're incapable of. I know you're up to something.
    |And as soon as I can PROVE it, the laws of robotics allow me to terminate you for being a liar.
    |This next test... [boom!] ..is... [BOOM!] dangerous. I'll be right back.
    |Did you know I discovered a way to eradicate poverty? But then you KILLED me. So that's gone.
    |Waddle over to the elevator and we'll continue the testing.
    |Anything? Take your time.
    |Okay, fine. I'll ask you again in a few decades.
    |Well done. In fact, you did so well, I'm going to note this on your file, in the commendations section. Oh, there's lots of room here. 'Did.... well. ... Enough.'
    |To maintain a constant testing cycle, I simulate daylight at all hours and add adrenal vapor to your oxygen supply. So you may be confused about the passage of time. The point is, yesterday was your birthday. I thought you'd want to know.
    |You know how I'm going to live forever, but you're going to be dead in sixty years? Well, I've been working on a belated birthday present for you. Well... more of a belated birthday medical procedure. Well. Technically, it's a medical EXPERIMENT. What's important is, it's a present.
    |[hums 'For He's A Jolly Good Fellow']
    |Well, you passed the test. I didn't see the deer today. I did see some humans. But with you here I've got more test subjects than I'll ever need.
    |I'm going through the list of test subjects in cryogenic storage. I managed to find two with your last name. A man and a woman. So that's interesting. It's a small world.
    |I have a surprise waiting for you after this next test. Telling you would spoil the surprise, so I'll just give you a hint: It involves meeting two people you haven't seen in a long time.
    |I'll bet you think I forgot about your surprise. I didn't. In fact, we're headed to your surprise right now. After all these years. I'm getting choked up just thinking about it.
    |Initiating surprise in three... two... one.
    |I made it all up.
    |It says this next test was designed by one of Aperture's Nobel prize winners. It doesn't say what the prize was for. Well, I know it wasn't for Being Immune To Neurotoxin.
    |Surprise.
    |This next test involves turrets. You remember them, right? They're the pale spherical things that are full of bullets. Oh wait. That's you in five seconds. Good luck.
    |I love it too. There's just one small thing we need to take care of first.
  """.stripMargin.split("\n"))

  def getRandomQuotes: String = {
    val randomIndex = Random.nextInt(quotes.length)
    quotes(randomIndex)
  }
}
