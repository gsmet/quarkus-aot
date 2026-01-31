package fr.spacefox.perftests.quarkus.core.service386;

import fr.spacefox.perftests.quarkus.core.port.data.Entity386DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service386.model.Model386;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service386 {

    private final Entity386DatasourcePort datasource;

    public Service386(Entity386DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model386 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
