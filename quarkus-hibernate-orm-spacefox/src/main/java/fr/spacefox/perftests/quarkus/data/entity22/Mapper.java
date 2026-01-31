package fr.spacefox.perftests.quarkus.data.entity22;

import fr.spacefox.perftests.quarkus.core.service22.model.Model22;

final class Mapper {
    private Mapper() {}

    public static Model22 of(Entity22 entity) {
        return new Model22(entity.getId(), entity.getField());
    }
}
