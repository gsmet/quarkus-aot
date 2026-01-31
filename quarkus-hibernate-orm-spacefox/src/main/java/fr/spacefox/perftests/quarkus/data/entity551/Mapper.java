package fr.spacefox.perftests.quarkus.data.entity551;

import fr.spacefox.perftests.quarkus.core.service551.model.Model551;

final class Mapper {
    private Mapper() {}

    public static Model551 of(Entity551 entity) {
        return new Model551(entity.getId(), entity.getField());
    }
}
