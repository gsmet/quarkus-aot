package fr.spacefox.perftests.quarkus.core.service532;

import fr.spacefox.perftests.quarkus.core.port.data.Entity532DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service532.model.Model532;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service532 {

    private final Entity532DatasourcePort datasource;

    public Service532(Entity532DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model532 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
