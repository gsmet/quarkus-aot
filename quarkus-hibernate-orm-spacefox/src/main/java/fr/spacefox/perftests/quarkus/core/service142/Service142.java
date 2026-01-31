package fr.spacefox.perftests.quarkus.core.service142;

import fr.spacefox.perftests.quarkus.core.port.data.Entity142DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service142.model.Model142;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service142 {

    private final Entity142DatasourcePort datasource;

    public Service142(Entity142DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model142 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
