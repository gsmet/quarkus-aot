package fr.spacefox.perftests.quarkus.data.entity449;

import fr.spacefox.perftests.quarkus.core.service449.model.Model449;

final class Mapper {
    private Mapper() {}

    public static Model449 of(Entity449 entity) {
        return new Model449(entity.getId(), entity.getField());
    }
}
