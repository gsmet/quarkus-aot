package fr.spacefox.perftests.quarkus.core.service906;

import fr.spacefox.perftests.quarkus.core.port.data.Entity906DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service906.model.Model906;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service906 {

    private final Entity906DatasourcePort datasource;

    public Service906(Entity906DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model906 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
