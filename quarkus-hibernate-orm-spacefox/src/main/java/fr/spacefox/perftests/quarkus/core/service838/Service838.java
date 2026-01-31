package fr.spacefox.perftests.quarkus.core.service838;

import fr.spacefox.perftests.quarkus.core.port.data.Entity838DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service838.model.Model838;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service838 {

    private final Entity838DatasourcePort datasource;

    public Service838(Entity838DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model838 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
