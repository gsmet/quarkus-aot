package fr.spacefox.perftests.quarkus.core.service444;

import fr.spacefox.perftests.quarkus.core.port.data.Entity444DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service444.model.Model444;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service444 {

    private final Entity444DatasourcePort datasource;

    public Service444(Entity444DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model444 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
