package fr.spacefox.perftests.quarkus.core.service1;

import fr.spacefox.perftests.quarkus.core.port.data.Entity1DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service1.model.Model1;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service1 {

    private final Entity1DatasourcePort datasource;

    public Service1(Entity1DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model1 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
