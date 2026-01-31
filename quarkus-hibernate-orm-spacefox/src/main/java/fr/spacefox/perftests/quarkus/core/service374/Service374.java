package fr.spacefox.perftests.quarkus.core.service374;

import fr.spacefox.perftests.quarkus.core.port.data.Entity374DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service374.model.Model374;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service374 {

    private final Entity374DatasourcePort datasource;

    public Service374(Entity374DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model374 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
