package fr.spacefox.perftests.quarkus.core.service779;

import fr.spacefox.perftests.quarkus.core.port.data.Entity779DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service779.model.Model779;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service779 {

    private final Entity779DatasourcePort datasource;

    public Service779(Entity779DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model779 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
