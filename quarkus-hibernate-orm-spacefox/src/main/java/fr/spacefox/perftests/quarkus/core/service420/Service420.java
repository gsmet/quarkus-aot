package fr.spacefox.perftests.quarkus.core.service420;

import fr.spacefox.perftests.quarkus.core.port.data.Entity420DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service420.model.Model420;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service420 {

    private final Entity420DatasourcePort datasource;

    public Service420(Entity420DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model420 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
