package fr.spacefox.perftests.quarkus.data.entity617;

import fr.spacefox.perftests.quarkus.core.service617.model.Model617;

final class Mapper {
    private Mapper() {}

    public static Model617 of(Entity617 entity) {
        return new Model617(entity.getId(), entity.getField());
    }
}
