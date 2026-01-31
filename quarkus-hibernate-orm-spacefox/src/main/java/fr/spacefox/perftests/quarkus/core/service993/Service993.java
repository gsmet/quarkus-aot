package fr.spacefox.perftests.quarkus.core.service993;

import fr.spacefox.perftests.quarkus.core.port.data.Entity993DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service993.model.Model993;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service993 {

    private final Entity993DatasourcePort datasource;

    public Service993(Entity993DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model993 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
