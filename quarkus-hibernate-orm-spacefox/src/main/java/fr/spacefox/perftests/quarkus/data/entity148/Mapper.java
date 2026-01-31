package fr.spacefox.perftests.quarkus.data.entity148;

import fr.spacefox.perftests.quarkus.core.service148.model.Model148;

final class Mapper {
    private Mapper() {}

    public static Model148 of(Entity148 entity) {
        return new Model148(entity.getId(), entity.getField());
    }
}
