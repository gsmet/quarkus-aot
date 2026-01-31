package fr.spacefox.perftests.quarkus.core.service630;

import fr.spacefox.perftests.quarkus.core.port.data.Entity630DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service630.model.Model630;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service630 {

    private final Entity630DatasourcePort datasource;

    public Service630(Entity630DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model630 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
