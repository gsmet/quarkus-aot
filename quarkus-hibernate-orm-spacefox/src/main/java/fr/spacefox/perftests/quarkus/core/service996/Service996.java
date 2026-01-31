package fr.spacefox.perftests.quarkus.core.service996;

import fr.spacefox.perftests.quarkus.core.port.data.Entity996DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service996.model.Model996;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service996 {

    private final Entity996DatasourcePort datasource;

    public Service996(Entity996DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model996 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
