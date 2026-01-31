package fr.spacefox.perftests.quarkus.data.entity737;

import fr.spacefox.perftests.quarkus.core.service737.model.Model737;

final class Mapper {
    private Mapper() {}

    public static Model737 of(Entity737 entity) {
        return new Model737(entity.getId(), entity.getField());
    }
}
