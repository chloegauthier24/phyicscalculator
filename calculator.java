import java.lang.Math;
class calculator {
  public static double velocity(double initialvelocity, double acceleration, double time){
    double velocity; 
    velocity = initialvelocity + (acceleration * time);
    return velocity; 
  }
  public static double position(double initialpos, double initialvelocity, double time, double acceleration){
    double position; 
    position = initialpos + (initialvelocity * time) + (.5 * acceleration) + (time * time);
    return position; 
  }
  public static double vsquared(double velocityinitial, double acceleration, double ogpos, double pos){
    double vsquared; 
    vsquared = (velocityinitial * velocityinitial) + (2 * acceleration) + (pos - ogpos);
    return vsquared; 
  }
  public static double acceleration(double netforce, double mass){
    double acceleration;
    acceleration = netforce / mass;
    return acceleration; 
  }
  public static double momentum(double mass, double velocity){
    double momentum;
    momentum = mass * velocity;
    return momentum;
  }
public static double momentumsum(double force, double totaltime){
  double momentumsum;
  momentumsum = force * totaltime;
  return momentumsum; 
}
  public static double netforce(double momentum, double time){
    double netforce = momentum / time;
    return netforce;
  }
   public static double impulse(double force, double time){
     double impulse = force * time;
     return impulse; 
   }
  public static double kinetice(double mass, double velocity){
    double kinetice = (velocity * velocity) * mass * .5;
    return kinetice;
  }
  public static double totalenergy(double force, double displacement, double angle){
    double totalenergy;
    totalenergy = force * (displacement * (Math.cos(angle)));
    return totalenergy; 
  }
  public static double power(double totale, double totalt){
    double power;
    power = totale / totalt;
    return power; 
  }
  public static double theta(double ogtheta, double ogangularspeed, double time, double angularacceleration){
    double theta; 
    theta = ogtheta + (ogangularspeed * time) + (.5 * angularacceleration * (time * time));
    return theta; 
  }
  public static double angularspeed(double ogangularspeed, double angularacceleration, double time){
    double angularspeed; 
    angularspeed = ogangularspeed + (angularacceleration * time);
    return angularspeed; 
  }
  public static double positiona(double amplitude, double frequency, double time){
    double positiona;
    positiona = Math.cos(amplitude) * (2 * 3.14) * (frequency * time);
    return positiona; 
  }
  public static double angulara(double nettorque, double roinertia){
    double angulara;
    angulara = nettorque / roinertia;
    return angulara;
  }
  public static double torque(double radius, double force, double theta){
    double torque;
    torque = (Math.sin(theta) * force) * radius; 
    return torque; 
  }
  public static double momentuma(double roinertia, double angularspeed){
    double momentuma;
    momentuma = roinertia / angularspeed;
    return momentuma; 
  }
  public static double summomentuma(double torque, double timesum){
    double summomentuma; 
    summomentuma= torque * timesum; 
    return summomentuma; 
  }
  public static double kinetic(double roinertia, double angularspeed){
    double kinetic; 
    kinetic = (angularspeed * angularspeed) * (roinertia * .5);
    return kinetic; 
  }
  public static double forces(double springco, double position){
    double forces;
    forces = springco * position;
    return forces; 
  }
  public static double potentiale(double springco, double position){
    double potentiale;
    potentiale = (.5 * springco) * (position * position);
    return potentiale;
  }
  public static double density(double mass, double volume){
    double density;
    density = mass / volume; 
    return density; 
  }
  public static double totalpe(double mass, double gravity, double totalheight){
    double totalpe;
    totalpe = mass * gravity * totalheight;
    return totalpe; 
  }
  public static double period(double frequency){
    double period;
    period = 1 / frequency;
    return period; 
  }
  public static double springperiod(double springco, double mass){
    double springperiod;
    springperiod = 6.28 * (Math.sqrt(mass / springco));
    return springperiod;
  }
  public static double pendulumperiod(double length, double gravity){
    double pendulumperiod;
    pendulumperiod = 6.28 * (Math.sqrt(length / gravity));
    return pendulumperiod;
    }
  public static double forcegravity(double gravity, double mass1, double mass2, double radius){
    double forcegravity;
    forcegravity = gravity * ((mass1 * mass2) / (radius * radius));
    return forcegravity; 
  }
  public static double gravity(double forcegravity, double mass){
    double gravity;
    gravity = forcegravity / mass;
    return gravity; 
  }
  public static double gravitationalpe(double gravity, double mass1, double mass2, double radius){
    double gravitationalpe;
    gravitationalpe = -((gravity * mass1 * mass2) / radius);
    return gravitationalpe; 
  }
}