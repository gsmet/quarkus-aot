package fr.spacefox.perftests.quarkus.core.service455;

import fr.spacefox.perftests.quarkus.core.port.data.Entity455DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service455.model.Model455;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service455 {

    private final Entity455DatasourcePort datasource;

    public Service455(Entity455DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model455 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
