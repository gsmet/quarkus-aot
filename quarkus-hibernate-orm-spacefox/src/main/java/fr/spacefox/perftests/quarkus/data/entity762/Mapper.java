package fr.spacefox.perftests.quarkus.data.entity762;

import fr.spacefox.perftests.quarkus.core.service762.model.Model762;

final class Mapper {
    private Mapper() {}

    public static Model762 of(Entity762 entity) {
        return new Model762(entity.getId(), entity.getField());
    }
}
