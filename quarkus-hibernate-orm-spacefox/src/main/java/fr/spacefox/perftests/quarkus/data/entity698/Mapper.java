package fr.spacefox.perftests.quarkus.data.entity698;

import fr.spacefox.perftests.quarkus.core.service698.model.Model698;

final class Mapper {
    private Mapper() {}

    public static Model698 of(Entity698 entity) {
        return new Model698(entity.getId(), entity.getField());
    }
}
