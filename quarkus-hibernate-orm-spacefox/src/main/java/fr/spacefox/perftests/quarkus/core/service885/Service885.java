package fr.spacefox.perftests.quarkus.core.service885;

import fr.spacefox.perftests.quarkus.core.port.data.Entity885DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service885.model.Model885;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service885 {

    private final Entity885DatasourcePort datasource;

    public Service885(Entity885DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model885 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
