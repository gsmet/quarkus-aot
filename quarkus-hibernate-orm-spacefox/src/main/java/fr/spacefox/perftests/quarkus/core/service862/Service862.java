package fr.spacefox.perftests.quarkus.core.service862;

import fr.spacefox.perftests.quarkus.core.port.data.Entity862DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service862.model.Model862;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service862 {

    private final Entity862DatasourcePort datasource;

    public Service862(Entity862DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model862 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
