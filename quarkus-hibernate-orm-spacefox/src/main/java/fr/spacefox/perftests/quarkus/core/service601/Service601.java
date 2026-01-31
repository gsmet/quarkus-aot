package fr.spacefox.perftests.quarkus.core.service601;

import fr.spacefox.perftests.quarkus.core.port.data.Entity601DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service601.model.Model601;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service601 {

    private final Entity601DatasourcePort datasource;

    public Service601(Entity601DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model601 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
