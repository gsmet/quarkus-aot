package fr.spacefox.perftests.quarkus.core.service76;

import fr.spacefox.perftests.quarkus.core.port.data.Entity76DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service76.model.Model76;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service76 {

    private final Entity76DatasourcePort datasource;

    public Service76(Entity76DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model76 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
