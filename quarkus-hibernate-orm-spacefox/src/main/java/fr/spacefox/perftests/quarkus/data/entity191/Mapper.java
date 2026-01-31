package fr.spacefox.perftests.quarkus.data.entity191;

import fr.spacefox.perftests.quarkus.core.service191.model.Model191;

final class Mapper {
    private Mapper() {}

    public static Model191 of(Entity191 entity) {
        return new Model191(entity.getId(), entity.getField());
    }
}
