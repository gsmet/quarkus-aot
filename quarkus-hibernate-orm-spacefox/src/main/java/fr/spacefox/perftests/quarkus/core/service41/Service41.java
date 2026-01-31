package fr.spacefox.perftests.quarkus.core.service41;

import fr.spacefox.perftests.quarkus.core.port.data.Entity41DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service41.model.Model41;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service41 {

    private final Entity41DatasourcePort datasource;

    public Service41(Entity41DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model41 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
