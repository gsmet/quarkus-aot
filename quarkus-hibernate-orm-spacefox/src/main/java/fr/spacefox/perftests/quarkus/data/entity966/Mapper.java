package fr.spacefox.perftests.quarkus.data.entity966;

import fr.spacefox.perftests.quarkus.core.service966.model.Model966;

final class Mapper {
    private Mapper() {}

    public static Model966 of(Entity966 entity) {
        return new Model966(entity.getId(), entity.getField());
    }
}
