package fr.spacefox.perftests.quarkus.data.entity651;

import fr.spacefox.perftests.quarkus.core.service651.model.Model651;

final class Mapper {
    private Mapper() {}

    public static Model651 of(Entity651 entity) {
        return new Model651(entity.getId(), entity.getField());
    }
}
