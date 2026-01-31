package fr.spacefox.perftests.quarkus.core.service189;

import fr.spacefox.perftests.quarkus.core.port.data.Entity189DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service189.model.Model189;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service189 {

    private final Entity189DatasourcePort datasource;

    public Service189(Entity189DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model189 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
