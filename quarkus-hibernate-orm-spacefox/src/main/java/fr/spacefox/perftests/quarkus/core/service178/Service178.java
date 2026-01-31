package fr.spacefox.perftests.quarkus.core.service178;

import fr.spacefox.perftests.quarkus.core.port.data.Entity178DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service178.model.Model178;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service178 {

    private final Entity178DatasourcePort datasource;

    public Service178(Entity178DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model178 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
