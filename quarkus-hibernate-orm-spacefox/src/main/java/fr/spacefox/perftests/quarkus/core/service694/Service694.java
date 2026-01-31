package fr.spacefox.perftests.quarkus.core.service694;

import fr.spacefox.perftests.quarkus.core.port.data.Entity694DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service694.model.Model694;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service694 {

    private final Entity694DatasourcePort datasource;

    public Service694(Entity694DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model694 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
