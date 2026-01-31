package fr.spacefox.perftests.quarkus.core.service211;

import fr.spacefox.perftests.quarkus.core.port.data.Entity211DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service211.model.Model211;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service211 {

    private final Entity211DatasourcePort datasource;

    public Service211(Entity211DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model211 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
