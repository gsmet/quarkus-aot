package fr.spacefox.perftests.quarkus.core.service411;

import fr.spacefox.perftests.quarkus.core.port.data.Entity411DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service411.model.Model411;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service411 {

    private final Entity411DatasourcePort datasource;

    public Service411(Entity411DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model411 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
