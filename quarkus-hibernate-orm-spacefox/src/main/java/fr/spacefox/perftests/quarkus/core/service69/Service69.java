package fr.spacefox.perftests.quarkus.core.service69;

import fr.spacefox.perftests.quarkus.core.port.data.Entity69DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service69.model.Model69;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service69 {

    private final Entity69DatasourcePort datasource;

    public Service69(Entity69DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model69 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
