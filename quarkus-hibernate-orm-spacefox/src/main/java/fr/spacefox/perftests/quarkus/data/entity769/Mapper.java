package fr.spacefox.perftests.quarkus.data.entity769;

import fr.spacefox.perftests.quarkus.core.service769.model.Model769;

final class Mapper {
    private Mapper() {}

    public static Model769 of(Entity769 entity) {
        return new Model769(entity.getId(), entity.getField());
    }
}
