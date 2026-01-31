package fr.spacefox.perftests.quarkus.core.service80;

import fr.spacefox.perftests.quarkus.core.port.data.Entity80DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service80.model.Model80;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service80 {

    private final Entity80DatasourcePort datasource;

    public Service80(Entity80DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model80 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
