package fr.spacefox.perftests.quarkus.core.service624;

import fr.spacefox.perftests.quarkus.core.port.data.Entity624DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service624.model.Model624;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service624 {

    private final Entity624DatasourcePort datasource;

    public Service624(Entity624DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model624 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
