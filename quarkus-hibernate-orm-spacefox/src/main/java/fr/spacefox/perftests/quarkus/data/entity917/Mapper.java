package fr.spacefox.perftests.quarkus.data.entity917;

import fr.spacefox.perftests.quarkus.core.service917.model.Model917;

final class Mapper {
    private Mapper() {}

    public static Model917 of(Entity917 entity) {
        return new Model917(entity.getId(), entity.getField());
    }
}
