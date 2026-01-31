package fr.spacefox.perftests.quarkus.data.entity705;

import fr.spacefox.perftests.quarkus.core.service705.model.Model705;

final class Mapper {
    private Mapper() {}

    public static Model705 of(Entity705 entity) {
        return new Model705(entity.getId(), entity.getField());
    }
}
