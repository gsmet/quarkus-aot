package fr.spacefox.perftests.quarkus.data.entity203;

import fr.spacefox.perftests.quarkus.core.service203.model.Model203;

final class Mapper {
    private Mapper() {}

    public static Model203 of(Entity203 entity) {
        return new Model203(entity.getId(), entity.getField());
    }
}
