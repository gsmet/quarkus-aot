package fr.spacefox.perftests.quarkus.core.service865;

import fr.spacefox.perftests.quarkus.core.port.data.Entity865DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service865.model.Model865;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service865 {

    private final Entity865DatasourcePort datasource;

    public Service865(Entity865DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model865 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
